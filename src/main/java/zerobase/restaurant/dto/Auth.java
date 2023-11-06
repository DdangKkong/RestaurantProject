package zerobase.restaurant.dto;

import lombok.Data;
import zerobase.restaurant.entitydomain.MemberEntity;

import java.util.List;
import java.util.Set;

public class Auth {

    @Data
    public static class SignIn {
        private String username;
        private String password;
    }

    @Data
    public static class SighUp {
        private String username;
        private String password;
        private List<String> roles;

        public MemberEntity toEntity() {
            return MemberEntity.builder()
                    .username(this.username)
                    .password(this.password)
                    .roles(this.roles)
                    .build();
        }

    }

}
