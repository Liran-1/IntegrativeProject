package superapp.logic;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import entities.ObjectBoundary;

public interface ObjectsService {

	
	ObjectBoundary retrieveObject(@PathVariable("superapp") String superapp, 
			@PathVariable("InternalObjectId") String internalObjectId);
	
	ObjectBoundary[] getAllObjects();
	
	void updateAnObject(@PathVariable("superapp") String superapp, @PathVariable("InternalObjectId") String internalObjectId
			,@RequestBody ObjectBoundary updateBoundary);
//	
	ObjectBoundary createObject(@RequestBody ObjectBoundary newObjectBoundary);
}