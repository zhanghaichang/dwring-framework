import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanghaichang
 */
@SpringBootApplication
@EnableAdminServer
public class MonitorApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplicationStart.class, args);
    }
}