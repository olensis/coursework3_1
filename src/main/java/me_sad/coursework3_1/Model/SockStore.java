package me_sad.coursework3_1.Model;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SockStore {
    private Sock sock;
    @Min(1) private int quantity;
    private void setQuantity(){
        if(quantity>0){
            this.quantity = quantity;
        }else {
            throw new IllegalArgumentException("Колличество носков не может быть меньше нуля");
        }
    }
}
