package id.artivisi.coba.demowar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoWarApplication {

	@GetMapping("/halo")
	public Map<String, Object> halo(@RequestParam(required = false) String nama) {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("pesan", (nama != null && nama.length() > 0) ? "Halo "+nama : "Halo ...");
		data.put("waktu", LocalDateTime.now());
		return data;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoWarApplication.class, args);
	}
}
