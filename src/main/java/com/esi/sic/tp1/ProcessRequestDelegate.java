package com.esi.sic.tp1;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class ProcessRequestDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Notification- Client");

    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("Facture N° " + execution.getVariable("num_facture")
                + " BC N° " + execution.getVariable("numero") + "!");

    }
}
