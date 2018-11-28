package edu.insightr.gildedrose;

public class StrategyElixir implements UpdateStrategy {
    public void update(Item i){
        i.setSellIn(i.getSellIn()-1);
        int initialQuality = i.getQuality();
        i.setQuality(i.getQuality()-1);
        if(i.getSellIn() < 0){
            i.setQuality(i.getQuality()-1);
        }
        if(i.getName().contains("Conjured")){
            int gap = i.getQuality() - initialQuality;
            i.setQuality(i.getQuality() + gap);
        }
        if(i.getQuality() < 0){
            i.setQuality(0);
        }
    }
}
