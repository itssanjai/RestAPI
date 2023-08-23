package com.example.demo.modelcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelproject.ModelSeat;
import com.example.demo.modelservice.ModelService;

@RestController
public class ModelController {
	@Autowired
	ModelService me;
	
	//normal method
	@PostMapping("addcoustomer")
	public ModelSeat post(@RequestBody ModelSeat ms) {
		return me.postDetails(ms);
	}
	//list method
	@PostMapping("addcust")
	public List<ModelSeat> postn(@RequestBody List<ModelSeat> ms){
		return me.postnDetails(ms);
	}
	
	@PutMapping("update")
	 public ModelSeat put(@RequestBody ModelSeat ms) {
		return me.putDetails(ms);
	}
	@PutMapping("upid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody ModelSeat ms) {
		return me.changeinfobyid(id ,ms);
	}
	@DeleteMapping("delete")
	public String delete(@RequestBody ModelSeat ms) {
		me.deleteDetails(ms);
		return "Deletion Succees";
	}
	@DeleteMapping("deleteid/{id}")
	public String deletid(@PathVariable int id)
{
		 me.deletebyId(id);
		 return "Deletion Succees";
	}
	
	@GetMapping("show")
	public List<ModelSeat> get(){
		return me.getDetails();
	}
	

}
