package model.entities;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Department implements Serializable {

    @EqualsAndHashCode.Include
    private Integer id;
    private String name;
}

