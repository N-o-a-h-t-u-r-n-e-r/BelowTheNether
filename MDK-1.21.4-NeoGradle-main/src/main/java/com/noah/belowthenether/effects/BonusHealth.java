package com.noah.belowthenether.effects;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BonusHealth extends InstantenousMobEffect{

	public BonusHealth(MobEffectCategory category, int color) {
		super(category, color);
		
	}
	
	@Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		
			entity.getAttributes();
		return true;
        
    }


}
