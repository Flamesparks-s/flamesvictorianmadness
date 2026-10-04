package net.flamesparks4143.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class TurnCarpetBlock extends HorizontalFacingBlock {
    public TurnCarpetBlock(Settings settings) { super(settings); }

    protected static final VoxelShape SHAPE = Block.createCuboidShape((double) 0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)1.0F, (double)16.0F);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return !world.isAir(pos.down());
    }
}
