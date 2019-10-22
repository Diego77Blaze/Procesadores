//Visitor específico para calcular expresiones

public class VisitorNuestro extends LExprBaseVisitor<Integer>{
    @Override
    public Integer visitAdd(LExprParser.AddContent ctx){
        return (visit(ctx.e(0))+visit(ctx.e(1)));
    }

    @Override
    public Integer visitMult(LExprParser.MultContent ctx){
        return (visit(ctx.e(0))*visit(ctx.e(1)));
    }

    @Override
    public Integer visitInt(LExprParser.IntContent ctx){
        return Integer.valueOf(ctx.INT().getText());
    }

}