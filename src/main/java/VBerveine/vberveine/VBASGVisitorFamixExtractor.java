package VBerveine.vberveine;

import io.proleap.vb6.asg.metamodel.api.impl.ApiEnumerationConstantImpl;
import io.proleap.vb6.asg.metamodel.api.impl.ApiEnumerationImpl;
import io.proleap.vb6.asg.metamodel.api.impl.ApiModuleImpl;
import io.proleap.vb6.asg.metamodel.api.impl.ApiProcedureImpl;
import io.proleap.vb6.asg.metamodel.api.impl.ApiPropertyImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ApiEnumerationCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ApiEnumerationConstantCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ApiProcedureCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ApiPropertyCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ArgCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.CallDelegateImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ConstantCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.DictionaryCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ElementVariableCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.EnumerationCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.EnumerationConstantCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.FunctionCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.MeCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.MembersCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ModuleCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.PropertyGetCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.PropertyLetCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.PropertySetCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.ReturnValueCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.SubCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.TypeElementCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.UndefinedCallImpl;
import io.proleap.vb6.asg.metamodel.call.impl.VariableCallImpl;
import io.proleap.vb6.asg.metamodel.impl.ArgImpl;
import io.proleap.vb6.asg.metamodel.impl.AttributeImpl;
import io.proleap.vb6.asg.metamodel.impl.ClazzModuleImpl;
import io.proleap.vb6.asg.metamodel.impl.DefTypeImpl;
import io.proleap.vb6.asg.metamodel.impl.LineLabelImpl;
import io.proleap.vb6.asg.metamodel.impl.LiteralImpl;
import io.proleap.vb6.asg.metamodel.impl.ModuleConfigElementImpl;
import io.proleap.vb6.asg.metamodel.impl.ProcedureDeclarationImpl;
import io.proleap.vb6.asg.metamodel.impl.ProgramImpl;
import io.proleap.vb6.asg.metamodel.impl.StandardModuleImpl;
import io.proleap.vb6.asg.metamodel.impl.TypeElementImpl;
import io.proleap.vb6.asg.metamodel.impl.TypeImpl;
import io.proleap.vb6.asg.metamodel.impl.VariableImpl;
import io.proleap.vb6.asg.metamodel.statement.appactivate.impl.AppActivateImpl;
import io.proleap.vb6.asg.metamodel.statement.beep.impl.BeepImpl;
import io.proleap.vb6.asg.metamodel.statement.chdir.impl.ChDirImpl;
import io.proleap.vb6.asg.metamodel.statement.chdrive.impl.ChDriveImpl;
import io.proleap.vb6.asg.metamodel.statement.close.impl.CloseImpl;
import io.proleap.vb6.asg.metamodel.statement.constant.impl.ConstantImpl;
import io.proleap.vb6.asg.metamodel.statement.date.impl.DateImpl;
import io.proleap.vb6.asg.metamodel.statement.deftype.impl.DeftypeImpl;
import io.proleap.vb6.asg.metamodel.statement.deletesetting.impl.DeleteSettingImpl;
import io.proleap.vb6.asg.metamodel.statement.doloop.impl.DoLoopImpl;
import io.proleap.vb6.asg.metamodel.statement.enumeration.impl.EnumerationConstantImpl;
import io.proleap.vb6.asg.metamodel.statement.enumeration.impl.EnumerationImpl;
import io.proleap.vb6.asg.metamodel.statement.event.impl.EventImpl;
import io.proleap.vb6.asg.metamodel.statement.exit.impl.ExitImpl;
import io.proleap.vb6.asg.metamodel.statement.foreach.impl.ElementVariableImpl;
import io.proleap.vb6.asg.metamodel.statement.foreach.impl.ForEachImpl;
import io.proleap.vb6.asg.metamodel.statement.fornext.impl.ForNextImpl;
import io.proleap.vb6.asg.metamodel.statement.function.Function;
import io.proleap.vb6.asg.metamodel.statement.function.impl.FunctionImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.BlockIfThenElseImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.ElseBlockImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.ElseIfBlockImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.IfBlockImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.IfConditionImpl;
import io.proleap.vb6.asg.metamodel.statement.ifstmt.impl.InlineIfThenElseImpl;
import io.proleap.vb6.asg.metamodel.statement.let.impl.LetImpl;
import io.proleap.vb6.asg.metamodel.statement.onerror.impl.OnErrorImpl;
import io.proleap.vb6.asg.metamodel.statement.open.impl.OpenImpl;
import io.proleap.vb6.asg.metamodel.statement.print.impl.PrintImpl;
import io.proleap.vb6.asg.metamodel.statement.property.get.impl.PropertyGetImpl;
import io.proleap.vb6.asg.metamodel.statement.property.let.impl.PropertyLetImpl;
import io.proleap.vb6.asg.metamodel.statement.property.set.impl.PropertySetImpl;
import io.proleap.vb6.asg.metamodel.statement.redim.impl.ReDimImpl;
import io.proleap.vb6.asg.metamodel.statement.resume.impl.ResumeImpl;
import io.proleap.vb6.asg.metamodel.statement.savesetting.impl.SaveSettingImpl;
import io.proleap.vb6.asg.metamodel.statement.select.impl.SelectCaseCondExpressionImpl;
import io.proleap.vb6.asg.metamodel.statement.select.impl.SelectCaseCondImpl;
import io.proleap.vb6.asg.metamodel.statement.select.impl.SelectCaseImpl;
import io.proleap.vb6.asg.metamodel.statement.select.impl.SelectImpl;
import io.proleap.vb6.asg.metamodel.statement.set.impl.SetImpl;
import io.proleap.vb6.asg.metamodel.statement.sub.Sub;
import io.proleap.vb6.asg.metamodel.statement.sub.impl.SubImpl;
import io.proleap.vb6.asg.metamodel.statement.whilestmt.impl.WhileImpl;
import io.proleap.vb6.asg.metamodel.statement.with.impl.WithImpl;
import io.proleap.vb6.asg.metamodel.statement.write.impl.WriteImpl;
import io.proleap.vb6.asg.metamodel.type.VbBaseType;
import io.proleap.vb6.asg.metamodel.type.impl.BaseTypeImpl;
import io.proleap.vb6.asg.metamodel.type.impl.ComplexTypeImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.ArgValueAssignmentImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.ArithmeticValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.BooleanValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.CallValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.LiteralValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.NewValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.StringValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.StructValueStmtImpl;
import io.proleap.vb6.asg.metamodel.valuestmt.impl.ValueAssignmentImpl;
import io.proleap.vb6.asg.visitor.VBASGVisitor;

import java.util.Stack;

import ch.akuhn.fame.Repository;
import io.proleap.vb6.asg.metamodel.ASGElement;
import io.proleap.vb6.asg.metamodel.Module;
import io.proleap.vb6.asg.metamodel.Procedure;

public class VBASGVisitorFamixExtractor implements VBASGVisitor {
	protected Stack<ASGElement> stack = new Stack<ASGElement>(); 
	public VBASGVisitorFamixExtractor() {
		
		setFamixRepo(new Repository(eu.synectique.verveine.core.gen.famix.FAMIXModel.metamodel()));
		
	}
	
	
	private void setFamixRepo(Repository repository) {
		// TODO Auto-generated method stub
			throw new RuntimeException ("Must implement!");
		
	}


	@Override
	public void visit(ApiEnumerationCallImpl apiEnumerationCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiEnumerationConstantCallImpl apiEnumerationConstantCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiEnumerationConstantImpl apiEnumerationConstantImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");
	}

	@Override
	public void visit(ApiEnumerationImpl apiEnumerationImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiModuleImpl apiModuleImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiProcedureCallImpl apiProcedureCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiProcedureImpl apiProcedureImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiPropertyCallImpl apiPropertyCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ApiPropertyImpl apiPropertyImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");
	}

	@Override
	public void visit(AppActivateImpl appActivateImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ArgCallImpl argCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ArgImpl argImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ArgValueAssignmentImpl argValueAssignmentImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ArithmeticValueStmtImpl arithmeticValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(AttributeImpl attributeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(BaseTypeImpl baseTypeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");
	}

	@Override
	public void visit(BeepImpl beepImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(BlockIfThenElseImpl blockIfThenElseImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(BooleanValueStmtImpl booleanValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(CallDelegateImpl callDelegateImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(CallValueStmtImpl callValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ChDirImpl chDirImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ChDriveImpl chDriveImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ClazzModuleImpl clazzModuleImpl) {
		System.out.println("ClazzModule " + clazzModuleImpl.getName());
		
		for (Function element : clazzModuleImpl.getFunctions()) {
			element.acceptVisitor(this);
		}
		for (Procedure element : clazzModuleImpl.getProcedures()) {
			element.acceptVisitor(this);
		}
		for (Sub element : clazzModuleImpl.getSubs()) {
			element.acceptVisitor(this);
		}
		
	}

	@Override
	public void visit(CloseImpl closeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ComplexTypeImpl complexTypeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ConstantCallImpl constantCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ConstantImpl constantImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DateImpl dateImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DeftypeImpl deftypeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DefTypeImpl defTypeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DeleteSettingImpl deleteSettingImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DictionaryCallImpl dictionaryCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(DoLoopImpl doLoopImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ElementVariableCallImpl elementVariableCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ElementVariableImpl elementVariableImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ElseBlockImpl elseBlockImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ElseIfBlockImpl elseIfBlockImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(EnumerationCallImpl enumerationCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(EnumerationConstantCallImpl enumerationConstantCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(EnumerationConstantImpl enumerationConstantImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(EnumerationImpl enumerationImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(EventImpl eventImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ExitImpl exitImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ForEachImpl forEachImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ForNextImpl forNextImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(FunctionCallImpl functionCallImpl) {
		// TODO Auto-generated method stub
		System.out.println("FunctionCall " + functionCallImpl.getName());
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(FunctionImpl functionImpl) {
		// TODO Auto-generated method stub
		System.out.println("Function " + functionImpl.getName());
		

	}

	@Override
	public void visit(IfBlockImpl ifBlockImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(IfConditionImpl ifConditionImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(InlineIfThenElseImpl inlineIfThenElseImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(LetImpl letImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(LineLabelImpl lineLabelImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(LiteralImpl literalImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(LiteralValueStmtImpl literalValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(MeCallImpl meCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(MembersCallImpl membersCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ModuleCallImpl moduleCallImpl) {
		// TODO Auto-generated method stub
		System.out.println("Module " + moduleCallImpl.getName());
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ModuleConfigElementImpl moduleConfigElementImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(NewValueStmtImpl newValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(OnErrorImpl onErrorImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(OpenImpl openImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PrintImpl printImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ProcedureDeclarationImpl procedureDeclarationImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visitASGElement(ASGElement element) {
		if (element.getProgram() == null) {
			return;
		}
		for (ASGElement el : element.getChildren()) {
			el.acceptVisitor(this);
		}
	}

	@Override
	public void visit(ProgramImpl programImpl) {

		for (Module module : programImpl.getModules()) {
			module.acceptVisitor(this);
		}
	}

	@Override
	public void visit(PropertyGetCallImpl propertyGetCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PropertyGetImpl propertyGetImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PropertyLetCallImpl propertyLetCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PropertyLetImpl propertyLetImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PropertySetCallImpl propertySetCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(PropertySetImpl propertySetImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ReDimImpl reDimImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ResumeImpl resumeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ReturnValueCallImpl returnValueCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SaveSettingImpl saveSettingImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SelectCaseCondExpressionImpl selectCaseCondExpressionImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SelectCaseCondImpl selectCaseCondImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SelectCaseImpl selectCaseImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SelectImpl selectImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SetImpl setImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(StandardModuleImpl standardModuleImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(StringValueStmtImpl stringValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(StructValueStmtImpl structValueStmtImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SubCallImpl subCallImpl) {
		// TODO Auto-generated method stub
		System.out.println("SubCall " + subCallImpl.getName());
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(SubImpl subImpl) {
		// TODO Auto-generated method stub
		System.out.println("Sub " + subImpl.getName());
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(TypeElementCallImpl typeElementCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(TypeElementImpl typeElementImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(TypeImpl typeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(UndefinedCallImpl undefinedCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(ValueAssignmentImpl valueAssignmentImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(VariableCallImpl variableCallImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(VariableImpl variableImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(VbBaseType vbBaseType) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(WhileImpl whileImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(WithImpl withImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

	@Override
	public void visit(WriteImpl writeImpl) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Must implement!");

	}

}
