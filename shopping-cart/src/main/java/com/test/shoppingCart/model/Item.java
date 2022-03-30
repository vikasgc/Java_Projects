package com.test.shoppingCart.model;
/*First commit*/
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Item")
public class Item {

private int id;
private String itemName;
private String itemDesc;
private String vendorName;

}