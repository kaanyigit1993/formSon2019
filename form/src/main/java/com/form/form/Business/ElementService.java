package com.form.form.Business;



import org.springframework.stereotype.Service;

import com.form.form.Repository.IElementRepository;
import com.form.form.JPAEntities.Element;
@Service
public class ElementService {
	
	private IElementRepository repo;
	

	
	public void save(Element element)
	{
		repo.save(element);
	}

	public Element get(Long id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
}
