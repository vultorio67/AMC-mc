// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modelsteve() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(36, 44).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
		Body.setTextureOffset(2, 48).addBox(-4.0F, 9.0F, 2.0F, 8.0F, -8.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(9, 1).addBox(0.3F, 7.5F, 3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 8).addBox(-1.3F, 7.5F, 3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-0.9F, 2.1F, 3.3F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(3, 9).addBox(-4.3F, 8.0F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(3, 9).addBox(3.3F, 8.0F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(29, 0).addBox(2.8F, 1.0F, 2.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(23, 11).addBox(-4.8F, 1.0F, 2.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 21).addBox(-4.8F, 1.0F, 5.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(6, 23).addBox(2.8F, 1.0F, 5.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(23, 0).addBox(4.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(18, 22).addBox(-5.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 23).addBox(1.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(12, 22).addBox(-2.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(32, 26).addBox(2.8F, 0.0F, 3.3F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(8, 16).addBox(-4.8F, 0.0F, 3.3F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(40, 8).addBox(2.8F, 9.7F, 3.3F, 2.0F, -1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(37, 1).addBox(-4.8F, 9.7F, 3.3F, 2.0F, -1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(30, 24).addBox(-2.0F, 0.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(17, 0).addBox(-1.5F, 0.4F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 16).addBox(3.475F, 1.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(9, 8).addBox(-4.475F, 1.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(10, 15).addBox(3.475F, 6.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(9, 0).addBox(-4.475F, 6.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(0, 35).addBox(4.4F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 32).addBox(-5.4F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(9, 33).addBox(2.2F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(27, 32).addBox(-3.2F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(26, 42).addBox(4.4F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(23, 32).addBox(-5.4F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(5, 33).addBox(2.2F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(30, 15).addBox(-3.2F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, -1.5708F);
		cube_r1.setTextureOffset(26, 27).addBox(1.6F, 1.0F, -6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 1.5708F);
		cube_r2.setTextureOffset(29, 10).addBox(-2.6F, 1.0F, -6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-2.6F, 1.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 8).addBox(-2.6F, 6.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(48, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}