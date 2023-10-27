package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String email;

    private String userName;

    private String userPhone;

    public static UserDto fromEntity(User user){
        return UserDto.builder()
                .email(user.getEmail())
                .userName(user.getUserName())
                .userPhone(user.getUserPhone())
                .build();
    }

}
