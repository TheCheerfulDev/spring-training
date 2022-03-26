package nl.anva.springtraining.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Document
@NoArgsConstructor
@AllArgsConstructor
public class BoardGame {

    @Id
    private String id;
    @NotBlank
    private String name;
    @Min(1)
    private int minPlayers;
    @Max(50)
    private int maxPlayers;

}
