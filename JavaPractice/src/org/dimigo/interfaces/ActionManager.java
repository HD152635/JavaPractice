package org.dimigo.interfaces;

public class ActionManager {
	
	public static final String PKG_NAME = "org.dimigo.interfaces.";
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if(args == null || args.length == 0) return;
		System.out.println(args[0]);
		IAction action = getAction2(args[0]);
		action.execute();
	}
	private static IAction getAction(String actionName){
		if("Insert".equals(actionName)){
			return new InsertAction();
		} else if("Delete".equals(actionName)){
			return new DeleteAction();
		} else if("Update".equals(actionName)){
			return new UpdateAction();
		} 
		return null;
	}
	private static IAction getAction2(String actionName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls = Class.forName(PKG_NAME + actionName + "Action");
		IAction action = (IAction) cls.newInstance();
		
		return action;
	}
}