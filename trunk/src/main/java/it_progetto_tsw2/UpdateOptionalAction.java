package it_progetto_tsw2;



public class UpdateOptionalAction extends BaseOptionalAction 
{
	public String execute() throws Exception 
	{
		super.service.updateOptional(super.optional,super.optional.getNome_optional());
		return SUCCESS;
	}
}
