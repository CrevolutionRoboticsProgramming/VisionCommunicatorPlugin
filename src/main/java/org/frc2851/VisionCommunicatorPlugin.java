package org.frc2851;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import org.frc2851.data.type.PlaceholderType;
import org.frc2851.widget.VisionCommunicatorWidget;

import java.util.List;
import java.util.Map;

@Description(
        group = "org.frc2851",
        name = "VisionCommunicatorPlugin",
        version = "2019.1.1",
        summary = "Shows an interface for communicating with Crevolution's vision processing client"
)
public final class VisionCommunicatorPlugin extends Plugin
{

    @Override
    public List<DataType> getDataTypes()
    {
        return List.of(
                PlaceholderType.Instance
        );
    }

    @Override
    public List<ComponentType> getComponents()
    {
        return List.of(
                WidgetType.forAnnotatedWidget(VisionCommunicatorWidget.class)
        );
    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents()
    {
        return Map.of(
                PlaceholderType.Instance, WidgetType.forAnnotatedWidget(VisionCommunicatorWidget.class)
        );
    }
}
