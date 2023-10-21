package com.dplayend.example;

import com.dplayend.example.registry.Register;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MyExampleMod.MOD_ID)
public class MyExampleMod {
    public static final String MOD_ID = "example";

    public MyExampleMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Register.load(bus);
    }
}