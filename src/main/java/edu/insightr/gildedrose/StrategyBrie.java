package edu.insightr.gildedrose;

public class StrategyBrie implements UpdateStrategy {
    public void update(Item i){
        i.setSellIn(i.getSellIn()-1);
        System.out.println("test");
        int initialQuality = i.getQuality();
        if(i.getQuality() < 50){
            i.setQuality(i.getQuality()+1);
        }
        if(i.getSellIn() < 0){
            if(i.getQuality() < 50){
                i.setQuality(i.getQuality()+1);
            }
        }
        if(i.getName().contains("Conjured")){
            int gap = i.getQuality() - initialQuality;
            i.setQuality(i.getQuality() + gap);
        }
        if(i.getQuality() > 50){
            i.setQuality(50);
        }
    }
}
