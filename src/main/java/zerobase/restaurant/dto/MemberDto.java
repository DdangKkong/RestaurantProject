package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.MemberEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {

    private String email;

    private String userName;

    private String userPhone;

    public static MemberDto fromEntity(MemberEntity memberEntity){
        return MemberDto.builder()
                .email(memberEntity.getMemberId())
                .userName(memberEntity.getUsername())
                .userPhone(memberEntity.getUserPhone())
                .build();
    }

}
