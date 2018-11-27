package edu.insightr.gildedrose;

public interface IVisitor {
    void visit(Item i);
    void visit(Brie brie);
    void visit(Cake cake);
    void visit(Elixir elixir);
    void visit(Passes passes);
    void visit(Sulfuras sulfuras);
    void visit(Vest vest);
}
