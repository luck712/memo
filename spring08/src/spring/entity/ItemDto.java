package spring.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {
		private int no;
		private String name;
		private String type;
		private int price;
}
