package schoology;

import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.OAuthProviderListener;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

public class OAuthDemo {

	public static void main(String[] args) throws Exception {
		String consumerKey = "30d41d042f62fbc9165521f4806d239f05604632f";
		String consumerSecret = "2d891c7ea1534919546226f1f336ccc0";
		
		OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
		
		String baseUrl = "https://api.schoology.com/v1";
		String accessTokenUrl = baseUrl + "/oauth/access_token";
		String requestTokenUrl = baseUrl + "/oauth/request_token";
		String authorizeUrl = baseUrl + "/oauth/authorize?return_url=url&oauth_token=";
		
		OAuthProvider provider = new DefaultOAuthProvider(requestTokenUrl, accessTokenUrl, authorizeUrl);
		
		System.out.println("Fetching request token... ");
		
		String authUrl = provider.retrieveRequestToken(consumer, OAuth.OUT_OF_BAND);
		
		System.out.println("Request token: " + consumer.getToken());
		System.out.println("Token secret: " + consumer.getTokenSecret());
		
	}
}
