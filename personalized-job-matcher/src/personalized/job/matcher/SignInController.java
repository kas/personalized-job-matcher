package personalized.job.matcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.awt.event.ActionEvent;

public class SignInController {
    SignInView loginPrompt;
    JobSeekerList userList;

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public SignInController() {
        loginPrompt = new SignInView();
        userList = new JobSeekerList();
        newButtonListeners();

        // access Employers in ArrayList
	JSONObject json = null;
	try {
		json = readJsonFromUrl("https://personalized-job-matcher.herokuapp.com/api/employers");
	} catch  (IOException e) {
		System.out.println(e.toString());
	}
	
	if (json != null) {
		JSONArray employersJsonArray = json.getJSONArray("results");
		ArrayList<String> employersArrayList = new ArrayList<String>();
		for (int i = 0; i < employersJsonArray.length(); i++) {
			employersArrayList.add(employersJsonArray.getString(i));
		}
		System.out.println(employersArrayList.get(0));
	}
        // end
    }

    public void attemptLogin(){
        String text = loginPrompt.sip.userText.getText().toString();
        String text1 = loginPrompt.sip.passText.getText().toString();
        System.out.println(text + "\n" + text1);
    }

    public void authenticatePass(){
        JobSeekerController jsController = new JobSeekerController();
    }
    public void authenticateFailed(){
        loginPrompt.sip.loginFailPrompt();
    }

    private void newButtonListeners() {
        loginPrompt.sip.submit.addActionListener((ActionEvent evt) -> {
            attemptLogin();
        });
    }
}
