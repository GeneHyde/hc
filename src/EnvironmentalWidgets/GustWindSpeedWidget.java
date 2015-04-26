/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvironmentalWidgets;

import Configuration.UnitLabelUtilities;
import DataObjects.CurrentDataObjectSet;

/**
 *
 * @author jtroxel
 */
public class GustWindSpeedWidget extends EnvironmentalWidget {

    public GustWindSpeedWidget() {
        super("Gust Wind Speed", true, true);
    }

    @Override
    public void update() {
        this.field.setText(CurrentWidgetDataSet.getInstance().getValue("gustspeed"));
    }

    @Override
    public void update(String msg) {
    }

    @Override
    public void setupUnits() {
        unitId = CurrentDataObjectSet.getCurrentDataObjectSet().getCurrentProfile().getUnitSetting("gustwindspeed");
        unit.setText(" " + UnitLabelUtilities.velocityUnitIndexToString(unitId));
    }
    
}