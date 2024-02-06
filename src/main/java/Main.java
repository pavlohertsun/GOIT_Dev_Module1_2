import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Pavlo", "Hertsun");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("User default output:" + user);
        System.out.println("User json output:" + objectMapper.writeValueAsString(user));
    }
}
