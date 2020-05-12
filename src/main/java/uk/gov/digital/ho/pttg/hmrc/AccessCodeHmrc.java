package uk.gov.digital.ho.pttg.hmrc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class AccessCodeHmrc {

    private final String code;
    private final int validDuration;
    private final String refreshToken;
    private final String scope;

    @JsonCreator
    public AccessCodeHmrc(@JsonProperty(value = "access_token", required = true) String code,
                          @JsonProperty(value = "scope", required = true) String scope,
                          @JsonProperty(value = "expires_in", required = true) int expiresIn,
                          @JsonProperty(value = "refresh_token") String refreshToken) {
        this.code = code;
        this.scope = scope;
        this.validDuration = expiresIn;
        this.refreshToken = refreshToken;
    }
}
