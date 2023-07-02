package Authentication;


import lombok.Getter;

@Getter
public record AuthenticationResponse(String jwt) {
}

