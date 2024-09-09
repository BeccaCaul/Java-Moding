package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ZomboEntity extends Blaze {

    //type instance
    public static EntityType<ZomboEntity> TYPE = (EntityType<ZomboEntity>)
            EntityType.Builder.of(ZomboEntity::new, MobCategory.MONSTER)
                    .build("zombo")
                    .setRegistryName(BaseMod.MODID, "zombo");
    //egg instance
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xff8fc9, 0xff2a7e);
    //construdctor
    public ZomboEntity(EntityType<? extends Blaze> type, Level level) {
        super(type, level);
    }
        //attributes
        public static AttributeSupplier.Builder createAttributes() {
            return Monster.createMonsterAttributes()
                    .add(Attributes.FLYING_SPEED, 0.1F)
                    .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
        }
        //registerGoals method
    @Override
    public void registerGoals() {
        //swimming
        this.targetSelector.addGoal(0, new FloatGoal(this));
        //attack who
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Llama.class, false));
//attack
        this.targetSelector.addGoal(3, new MeleeAttackGoal(this, 0.8f, false));
        //get help
        this.targetSelector.addGoal(4, (new HurtByTargetGoal(this)).setAlertOthers(Bee.class));
        //look aroind
        this.targetSelector.addGoal(8, new RandomLookAroundGoal(this));
    }
    }


