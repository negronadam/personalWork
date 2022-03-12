package SwordCraftOnline;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SCO extends JavaPlugin {
	@Override
	public void onEnable()
	{
		getLogger().info("Hello World! SCO is now Enabled!");
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("Hello") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + " !");
			return true;
		}
		return false;
	}
}
