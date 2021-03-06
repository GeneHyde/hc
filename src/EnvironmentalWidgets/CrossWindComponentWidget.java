/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvironmentalWidgets;

import Configuration.UnitConversionRate;
import Configuration.UnitLabelUtilities;
import DataObjects.CurrentDataObjectSet;
import DataObjects.CurrentLaunchInformation;

/**
 *
 * @author jtroxel
 */
public class CrossWindComponentWidget extends EnvironmentalWidget {

    public CrossWindComponentWidget() {
        super(null, null, null);
    }

    @Override
    public void update() {
        float speed = (CurrentLaunchInformation.getCurrentLaunchInformation().getCrosswindComponent()) * UnitConversionRate.convertSpeedUnitIndexToFactor(unitId);
        field.setText(String.format("%.2f", speed));
    }

    @Override
    public void update(String msg) {
    }

    @Override
    public void setupUnits() {
        unitId = CurrentDataObjectSet.getCurrentDataObjectSet().getCurrentProfile().getUnitSetting("crosswind");
        unit.setText(" " + UnitLabelUtilities.velocityUnitIndexToString(unitId));
    }
    
}
