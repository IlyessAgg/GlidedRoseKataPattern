package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {
    public void visit(Item i){
        if(i.getClass() == Brie.class){
            visit((Brie)i);
        }
        else if(i.getClass() == Cake.class){
            visit((Cake)i);
        }
        else if(i.getClass() == Elixir.class){
            visit((Elixir)i);
        }
        else if(i.getClass() == Passes.class){
            visit((Passes)i);
        }
        else if(i.getClass() == Sulfuras.class){
            visit((Sulfuras)i);
        }
        else if(i.getClass() == Vest.class){
            visit((Vest)i);
        }
    }
    public void visit(Brie brie){
        brie.setSellIn(brie.getSellIn()-1);

        int initialQuality = brie.getQuality();
        if(brie.getQuality() < 50){
            brie.setQuality(brie.getQuality()+1);
        }
        if(brie.getSellIn() < 0){
            if(brie.getQuality() < 50){
                brie.setQuality(brie.getQuality()+1);
            }
        }
        if(brie.getName().contains("Conjured")){
            int gap = brie.getQuality() - initialQuality;
            brie.setQuality(brie.getQuality() + gap);
        }
        if(brie.getQuality() > 50){
            brie.setQuality(50);
        }
    }
    public void visit(Cake cake){
        cake.setSellIn(cake.getSellIn()-1);

        int initialQuality = cake.getQuality();
        cake.setQuality(cake.getQuality()-1);
        if(cake.getSellIn() < 0){
            cake.setQuality(cake.getQuality()-1);
        }
        if(cake.getName().contains("Conjured")){
            int gap = cake.getQuality() - initialQuality;
            cake.setQuality(cake.getQuality() + gap);
        }
        if(cake.getQuality() < 0){
            cake.setQuality(0);
        }
    }
    public void visit(Elixir elixir){
        elixir.setSellIn(elixir.getSellIn()-1);

        int initialQuality = elixir.getQuality();
        elixir.setQuality(elixir.getQuality()-1);
        if(elixir.getSellIn() < 0){
            elixir.setQuality(elixir.getQuality()-1);
        }
        if(elixir.getName().contains("Conjured")){
            int gap = elixir.getQuality() - initialQuality;
            elixir.setQuality(elixir.getQuality() + gap);
        }
        if(elixir.getQuality() < 0){
            elixir.setQuality(0);
        }
    }
    public void visit(Passes passes){
        passes.setSellIn(passes.getSellIn()-1);

        int initialQuality = passes.getQuality();
        if(passes.getSellIn() > 10){
            passes.setQuality(passes.getQuality()+1);
        }
        if(passes.getSellIn() <= 10){
            passes.setQuality(passes.getQuality()+2);
            if(passes.getSellIn() <= 5){
                passes.setQuality(passes.getQuality()+1);
            }
        }
        if(passes.getName().contains("Conjured")){
            int gap = passes.getQuality() - initialQuality;
            passes.setQuality(passes.getQuality() + gap);
        }
        if(passes.getQuality() > 50){
            passes.setQuality(50);
        }
        if(passes.getSellIn() < 0){
            passes.setQuality(0);
        }
    }
    public void visit(Sulfuras sulfuras){ }

    public void visit(Vest vest){
        vest.setSellIn(vest.getSellIn()-1);

        int initialQuality = vest.getQuality();
        vest.setQuality(vest.getQuality()-1);
        if(vest.getSellIn() < 0){
            vest.setQuality(vest.getQuality()-1);
        }
        if(vest.getName().contains("Conjured")){
            int gap = vest.getQuality() - initialQuality;
            vest.setQuality(vest.getQuality() + gap);
        }
        if(vest.getQuality() < 0){
            vest.setQuality(0);
        }
    }
}
