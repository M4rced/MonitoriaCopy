package edu.uco.monitoria.controller.validator;


import java.util.List;

import edu.uco.monitoria.crosscuting.messages.enumeration.Message;

public interface Validator <T> {
	List<Message> validate(T dto);
}
