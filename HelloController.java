@RestController
public class HelloController {
  @GetMapping("/")
  public String hello() {
    return "Hello from Kubernetes!";
  }
}
