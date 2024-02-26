package com.iesam.firsttime.features.vote.domain;

import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoteAppUseCaseTest {

    private VoteAppUseCase voteAppUseCase;

    @BeforeEach
    void setUp() {
        //Cuando se termine de ejecutar el test, pongo a nulo el caso de uso

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void cuandoAppConfigEsNuloEntoncesNoPuedoVotar(){
        //Given
        voteAppUseCase = new VoteAppUseCase();


        //When
        Boolean result = voteAppUseCase.execute();


        //Then: Asserts
        Assertions.assertTrue();

    }
}