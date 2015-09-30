package schoology;

import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;

public class OAuthDemo {

	public static void main(String[] args) throws Exception {
		String consumerKey = "30d41d042f62fbc9165521f4806d239f05604632f";
		String consumerSecret = "2d891c7ea1534919546226f1f336ccc0";
		
		OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
		
		String baseUrl = "https://api.schoology.com/v1";
		String appBaseUrl = "https://app.schoology.com";
		String accessTokenUrl = baseUrl + "/oauth/access_token?uid=28236413";
		String requestTokenUrl = baseUrl + "/oauth/request_token";
		String authorizeUrl = appBaseUrl + "/oauth/authorize";
		
		OAuthProvider provider = new SchoologyOAuthProvider(requestTokenUrl, accessTokenUrl, authorizeUrl);
		
		System.out.println("Fetching request token... ");
		
		String returnUrl = "https://test1.assistments.org";
		returnUrl = OAuth.percentEncode(returnUrl);
		String authUrl = provider.retrieveRequestToken(consumer, returnUrl);
		
		System.out.println("Request token: " + consumer.getToken());
		System.out.println("Token secret: " + consumer.getTokenSecret());
		System.out.println(authUrl.replace("oauth_callback", "return_url"));
		
	}
}
