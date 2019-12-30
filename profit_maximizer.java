public class Profit_Maximizer {

    public String uri = "https://www.albion-online-data.com/api/v2/stats/prices/T4_BAG,T5_BAG?locations=Caerleon,Bridgewatch&qualities=2";

    HttpClient client = HttpClient.newBuilder()
        .version(Version.HHTP_2)
        .followRedirects(Redirect.SAME_PROTOCOL)
        .authenticator(Authenticator.getDefault())
        .build();

    public void get(String uri) throws Exception {
        client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
            .uri(Uri.create(uri))
            .build();

        HttpResponse<String> response = 
            client.send(request, BodyHandlers.ofString());

        System.out.println(response.body)
    }
}