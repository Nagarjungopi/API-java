import io.prometheus.client.Counter;
@Service
public class MyApi {
    private static final Counter requests = Counter.build()
        .name("myapi_requests_total")
        .help("Total number of requests to My API.")
        .register();

    public Response handleRequest(Request request) {
        // Handle the request.
        // ...

        // Record the metric.
        requests.inc();

        // Return the response.
        // ...
    }
}

