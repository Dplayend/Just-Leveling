package com.dplayend.example.registry;

import com.dplayend.example.MyExampleMod;
import com.dplayend.justleveling.registry.RegistryAptitudes;
import com.dplayend.justleveling.registry.RegistryPassives;
import com.dplayend.justleveling.registry.passive.Passive;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Register {
    public static final DeferredRegister<Passive> REGISTER = DeferredRegister.create(RegistryPassives.PASSIVES_KEY, MyExampleMod.MOD_ID);

    public static final RegistryObject<Passive> NEW_HEALTH_ATTRIBUTE = REGISTER.register("new_passive", () -> new Passive(
            new ResourceLocation(MyExampleMod.MOD_ID, "new_passive"),
            RegistryAptitudes.CONSTITUTION.get(),
            new ResourceLocation(MyExampleMod.MOD_ID, "textures/skills/new_passive.png"),
            Attributes.MAX_HEALTH,
            "96a891fe-5919-418d-8205-f50464391400",
            100,
            2, 4, 6, 8, 10
    ));

    public static void load(IEventBus eventBus) {
        REGISTER.register(eventBus);
    }
}