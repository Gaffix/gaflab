package github.gaffix.gaflab.entity;

import github.gaffix.gaflab.init.GafLabEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class Skully extends Monster {
    public Skully(EntityType<Skully> type, Level level) {
        super(type, level);
        this.xpReward = 12;
    }

    public Skully(Level level, double x, double y, double z) {
        this(GafLabEntities.SKULLY_ENTITY.get(), level);
        setPos(x, y, z);
    }

    public Skully(Level level, BlockPos position) {
        this(level, position.getX(), position.getY(), position.getZ());
    }

    public void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 2f, true));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomFlyingGoal(this, 1f));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.addBehaviourGoals();
    }

    public void addBehaviourGoals() {
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 25.0D)
                .add(Attributes.MOVEMENT_SPEED, (double) 0.6F)
                .add(Attributes.ATTACK_DAMAGE, 4.0D)
                .add(Attributes.ARMOR, 3.0D)
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }

    public static boolean canSpawn(EntityType<Skully> entityType, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource random) {
        return Monster.checkMonsterSpawnRules(entityType, level, spawnType, position, random)
                && level.getDifficulty() != Difficulty.PEACEFUL
                && level.canSeeSky(position)
                && position.getY() > 40;
    }
}
