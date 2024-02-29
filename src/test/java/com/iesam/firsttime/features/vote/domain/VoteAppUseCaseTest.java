package com.iesam.firsttime.features.vote.domain;

import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;
import com.iesam.firsttime.features.vote.data.Stub5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNot5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNullAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
        voteAppUseCase = null;
    }

    @Test
    void cuandoAppConfigEsNuloEntoncesNoPuedoVotar() {
        //Given
        voteAppUseCase = new VoteAppUseCase(new StubNullAppConfigDataRepository());


        //When
        Boolean result = voteAppUseCase.execute();


        //Then: Asserts
        Assertions.assertFalse(result);

    }

    @Test
    void cuandoLaAppSeHaAbiertoDistintoDeCincoEntoncesMostrarVotar() {
        //Given
        voteAppUseCase = new VoteAppUseCase(new StubNot5AppConfigDataRepository());


        //When
        Boolean result = voteAppUseCase.execute();


        //Then: Asserts
        Assertions.assertFalse(result);

    }

    @Test
    void cuandoLaAppSeHaAbiertoCincoVecesEntoncesMostrarVotarEsTrue() {
        //Given
        voteAppUseCase = new VoteAppUseCase(new Stub5AppConfigDataRepository());


        //When
        Boolean result = voteAppUseCase.execute();


        //Then: Asserts
        Assertions.assertTrue(result);

    }
}