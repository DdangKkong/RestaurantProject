package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.Restaurant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantDto {

    private String restaurantName;

    private String restaurantInfo;

    public static RestaurantDto fromEntity(Restaurant restaurant){
        return RestaurantDto.builder()
                .restaurantName(restaurant.getRestaurantName())
                .restaurantInfo(restaurant.getRestaurantInfo())
                .build();
    }

}
