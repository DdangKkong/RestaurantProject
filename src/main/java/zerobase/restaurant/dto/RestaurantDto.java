package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.RestaurantEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantDto {

    private String restaurantName;

    private String restaurantInfo;

    public static RestaurantDto fromEntity(RestaurantEntity restaurantEntity){
        return RestaurantDto.builder()
                .restaurantName(restaurantEntity.getRestaurantName())
                .restaurantInfo(restaurantEntity.getRestaurantInfo())
                .build();
    }

}
