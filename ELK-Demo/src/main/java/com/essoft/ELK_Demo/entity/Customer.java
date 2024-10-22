package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "customer")
@TypeAlias("customerClass")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    String id;
    @Field(name = "customerName")
    String name;
    String surname;
    Long age;
    @Transient
    String fullName;
    boolean isActive;
//    @Field(type = FieldType.Integer_Range)
//    Range<Integer> validAge;
}
