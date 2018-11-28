package edu.insightr.gildedrose;

public class StrategyPasses implements UpdateStrategy {
    public void update(Item i){
        i.setSellIn(i.getSellIn()-1);
        int initialQuality = i.getQuality();
        if(i.getSellIn() > 10){
            i.setQuality(i.getQuality()+1);
        }
        if(i.getSellIn() <= 10){
            i.setQuality(i.getQuality()+2);
            if(i.getSellIn() <= 5){
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
        if(i.getSellIn() < 0){
            i.setQuality(0);
        }
    }
}
