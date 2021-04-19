package opwheat.opwheat;

import org.bukkit.ChatColor;
import org.bukkit.CropState;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.material.Crops;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Op Wheat Started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void wbe(BlockBreakEvent e){
        Player p = e.getPlayer();
        Block block = e.getBlock();
        Material bb = block.getType();

        if(e.getBlock().getState().getData() instanceof Crops && ((Crops) e.getBlock().getState().getData()).getState() == CropState.RIPE){

            Location loc = block.getLocation();

            ItemStack tnt = new ItemStack(Material.TNT,32);
            ItemStack ega = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE,8);
            ItemStack arrow = new ItemStack(Material.ARROW,64);
            ItemStack db = new ItemStack(Material.DIAMOND_BLOCK,2);
            ItemStack gb = new ItemStack(Material.GOLD_BLOCK,2);
            ItemStack eb = new ItemStack(Material.EMERALD_BLOCK,2);
            ItemStack n = new ItemStack(Material.NETHERITE_INGOT,1);
            ItemStack lava = new ItemStack(Material.LAVA_BUCKET,1);
            ItemStack water = new ItemStack(Material.WATER_BUCKET,1);
            ItemStack lvl = new ItemStack(Material.EXPERIENCE_BOTTLE,32);
            ItemStack obsi = new ItemStack(Material.OBSIDIAN,32);

            ItemStack sp = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta spmeta = (EnchantmentStorageMeta)sp.getItemMeta();
            spmeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 10, true);
            sp.setItemMeta(spmeta);

            ItemStack pr = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta prmeta = (EnchantmentStorageMeta)pr.getItemMeta();
            prmeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
            pr.setItemMeta(prmeta);

            ItemStack ef = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta efmeta = (EnchantmentStorageMeta)ef.getItemMeta();
            efmeta.addStoredEnchant(Enchantment.DIG_SPEED, 10, true);
            ef.setItemMeta(efmeta);

            ItemStack in = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta inmeta = (EnchantmentStorageMeta)in.getItemMeta();
            inmeta.addStoredEnchant(Enchantment.ARROW_INFINITE, 10, true);
            in.setItemMeta(inmeta);

            ItemStack un = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta unmeta = (EnchantmentStorageMeta)un.getItemMeta();
            unmeta.addStoredEnchant(Enchantment.DURABILITY, 10, true);
            un.setItemMeta(unmeta);

            ItemStack po = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta pometa = (EnchantmentStorageMeta)po.getItemMeta();
            pometa.addStoredEnchant(Enchantment.ARROW_DAMAGE, 10, true);
            po.setItemMeta(pometa);

            ItemStack pu = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta pumeta = (EnchantmentStorageMeta)pu.getItemMeta();
            pumeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 10, true);
            pu.setItemMeta(pumeta);

            ItemStack fl = new ItemStack(Material.ENCHANTED_BOOK,1);
            EnchantmentStorageMeta flmeta = (EnchantmentStorageMeta)fl.getItemMeta();
            flmeta.addStoredEnchant(Enchantment.ARROW_FIRE, 10, true);
            fl.setItemMeta(flmeta);

            ItemStack sd = new ItemStack(Material.POTION);
            PotionMeta sdmeta = (PotionMeta) sd.getItemMeta();
            sdmeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 3), true);
            sd.setItemMeta(sdmeta);

            ItemStack he = new ItemStack(Material.POTION);
            PotionMeta hemeta = (PotionMeta) he.getItemMeta();
            hemeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 3), true);
            he.setItemMeta(hemeta);

            ItemStack jt = new ItemStack(Material.POTION);
            PotionMeta jtmeta = (PotionMeta) jt.getItemMeta();
            jtmeta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 600, 3), true);
            jt.setItemMeta(jtmeta);

            ItemStack st = new ItemStack(Material.POTION);
            PotionMeta stmeta = (PotionMeta) st.getItemMeta();
            stmeta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 3), true);
            st.setItemMeta(stmeta);

            ItemStack dr = new ItemStack(Material.POTION);
            PotionMeta drmeta = (PotionMeta) dr.getItemMeta();
            drmeta.addCustomEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 3), true);
            dr.setItemMeta(drmeta);

            ItemStack h = new ItemStack(Material.POTION);
            PotionMeta hmeta = (PotionMeta) h.getItemMeta();
            hmeta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 2, 255), true);
            h.setItemMeta(hmeta);

            ItemStack fr = new ItemStack(Material.POTION);
            PotionMeta frmeta = (PotionMeta) fr.getItemMeta();
            frmeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 3), true);
            fr.setItemMeta(frmeta);

            int upper = 23;
            Random random = new Random();
            random.nextInt(1 +(upper));

            if(random.nextInt(upper) == 0){
                loc.getWorld().dropItem(loc,tnt);
            }else if(random.nextInt(upper) == 1){
                loc.getWorld().dropItem(loc, ega);
            }else if(random.nextInt(upper) == 2){
                loc.getWorld().dropItem(loc, arrow);
            }else if(random.nextInt(upper) == 3){
                loc.getWorld().dropItem(loc, db);
            }else if(random.nextInt(upper) == 4){
                loc.getWorld().dropItem(loc, gb);
            }else if(random.nextInt(upper) == 5){
                loc.getWorld().dropItem(loc, eb);
            }else if(random.nextInt(upper) == 6){
                loc.getWorld().dropItem(loc, n);
            }else if(random.nextInt(upper) == 7){
                loc.getWorld().dropItem(loc, lava);
            }else if(random.nextInt(upper) == 8){
                loc.getWorld().dropItem(loc, water);
            }else if(random.nextInt(upper) == 9){
                loc.getWorld().dropItem(loc, obsi);
            }else if(random.nextInt(upper) == 10){
                loc.getWorld().dropItem(loc, sp);
            }else if(random.nextInt(upper) == 11){
                loc.getWorld().dropItem(loc, pr);
            }else if(random.nextInt(upper) == 12){
                loc.getWorld().dropItem(loc, ef);
            }else if(random.nextInt(upper) == 13){
                loc.getWorld().dropItem(loc, in);
            }else if(random.nextInt(upper) == 14){
                loc.getWorld().dropItem(loc, un);
            }else if(random.nextInt(upper) == 15){
                loc.getWorld().dropItem(loc, po);
            }else if(random.nextInt(upper) == 16){
                loc.getWorld().dropItem(loc, pu);
            }else if(random.nextInt(upper) == 17){
                loc.getWorld().dropItem(loc, fl);
            }else if(random.nextInt(upper) == 18){
                loc.getWorld().dropItem(loc, sd);
            }else if(random.nextInt(upper) == 19){
                loc.getWorld().dropItem(loc, he);
            }else if(random.nextInt(upper) == 20){
                loc.getWorld().dropItem(loc, jt);
            }else if(random.nextInt(upper) == 21){
                loc.getWorld().dropItem(loc, st);
            }else if(random.nextInt(upper) == 21){
                loc.getWorld().dropItem(loc, dr);
            }else if(random.nextInt(upper) == 22){
                loc.getWorld().dropItem(loc, h);
            }else if(random.nextInt(upper) == 23){
                loc.getWorld().dropItem(loc, fr);
            }



        }

    }

}
