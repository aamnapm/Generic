package ir.aamnapm.generic.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {

    @ApiModelProperty(required = true, example = "ali")
    private String firstName;

    @ApiModelProperty(example = "24")
    private Integer age;

    //-------------------------------

    @Getter
    @Setter
    @Accessors(chain = true)
    @ApiModel("PersonInfo")
    public static class Info extends PersonDTO {

        @ApiModelProperty
        private Long id;
    }

    // ------------------------------

    @Getter
    @Setter
    @Accessors(chain = true)
    @ApiModel("PersonCreateRq")
    public static class Create extends PersonDTO {

    }

    // ------------------------------

    @Getter
    @Setter
    @Accessors(chain = true)
    @ApiModel("PersonUpdateRq")
    public static class Update extends PersonDTO {

        @NotNull
        @ApiModelProperty(required = true)
        private Integer version;
    }
}