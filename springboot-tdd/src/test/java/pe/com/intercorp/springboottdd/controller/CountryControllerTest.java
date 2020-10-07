package pe.com.intercorp.springboottdd.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import pe.com.intercorp.springboottdd.entity.Country;
import pe.com.intercorp.springboottdd.service.CountryService;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;



@SpringBootTest
@AutoConfigureMockMvc
public class CountryControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CountryService countryService;

    @Test
    public void debeRetornarOKSiSePuedeObtenerLosPaises() throws Exception {

        List<Country> lstCountry = new ArrayList<Country>();
        Country.builder().id(5).build();
        lstCountry.add(Country.builder().id(1L).code("PE").name("Peru").build());
        lstCountry.add(Country.builder().id(2L).code("CO").name("Colombia").build());

        given(countryService.findAll()).willReturn(lstCountry);

        mvc.perform(get("/country/findall")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.mensaje", is("OK")));

    }


}
