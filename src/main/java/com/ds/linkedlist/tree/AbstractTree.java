package com.ds.linkedlist.tree;

public abstract class AbstractTree<E> implements Tree<E>
{

	@Override
	public boolean isExternal( Position<E> position ) throws IllegalArgumentException
	{
		return numChildren(position) == 0;
	}

	@Override
	public boolean isInernal( Position<E> position ) throws IllegalArgumentException
	{
		return numChildren(position) > 0;
	}

	@Override
	public boolean isRoot( Position<E> position ) throws IllegalArgumentException
	{
		return position == root();
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int depth( Position<E> position )
	{
		if( isRoot(position) )
		{
			return 0;
		}
		return 1 + depth(position);

	}

	@Override
	public int height( Position<E> position )
	{
		int height = 0;

		for( Position<E> c : children(position) )
		{
			height = Math.max(height, 1 + height(c));
		}
		return height;
	}

}
