package com.greenfox.rest.rest;

import com.greenfox.rest.rest.controllers.DoubleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DoubleTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void test() throws Exception {

        mockMvc.perform(get("/doubling").param("input", String.valueOf(3)))
                .andExpect(status().isOk());
    }


  public class UntiTest {
      DoubleController doubleController = new DoubleController();

      @Test
      public void tester() {
          assertEquals(6, doubleController.makeDouble(3).getResult());
      }
  }

}
