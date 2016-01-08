package com.ds.linkedlist.tree;

import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E>
{

	protected Position<E> root;

	protected int         size;

	protected static class Node<E> implements Position<E>
	{

		Node<E> parent;

		Node<E> left;

		Node<E> right;

		E       element;

		public Node( Node<E> parent, Node<E> left, Node<E> right, E element )
		{
			this.element = element;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}

		@Override
		public E getElement()
		{
			return element;
		}

		public Node<E> getParent()
		{
			return parent;
		}

		public void setParent( Node<E> parent )
		{
			this.parent = parent;
		}

		public Node<E> getLeft()
		{
			return left;
		}

		public void setLeft( Node<E> left )
		{
			this.left = left;
		}

		public Node<E> getRight()
		{
			return right;
		}

		public void setRight( Node<E> right )
		{
			this.right = right;
		}

		public void setElement( E element )
		{
			this.element = element;
		}
	}

	protected Node<E> createNode( Node<E> parent, Node<E> left, Node<E> right, E element )
	{
		return new Node<E>(parent, left, right, element);
	}

	protected Node<E> validate(Position<E> position) throws IllegalArgumentException
	{
		if( !(position instanceof Node<?>) )
		{
			throw new IllegalArgumentException("Not a valid Position type");
		}

		Node<E> node = (Node<E>) position;
		if( node.parent == node )
		{
			throw new IllegalArgumentException("Position is no longer in three");
		}

		return node;
	}

	@Override
	public Position<E> left( Position<E> position ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		return node.left;
	}

	@Override
	public Position<E> right( Position<E> position ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		return node.right;
	}

	@Override
	public Position<E> root()
	{
		return root;
	}

	@Override
	public Position<E> parent( Position<E> position ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		return node.parent;
	}

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> poistions()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addRoot( E element ) throws IllegalStateException
	{
		if( !isEmpty() )
		{
			throw new IllegalStateException("Tree is not empty");
		}
		root = createNode(null, null, null, element);
		size++;
		return root;
	}

	@Override
	public Position<E> addLeft( Position<E> position, E element ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		if(node.left != null){			
			throw new IllegalArgumentException("position already has a left child");
		}
		Node<E> left = createNode(node, null, null, element);
		node.left = left;
		return left;
	}

	@Override
	public Position<E> addRight( Position<E> position, E element ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		if( node.right != null )
		{
			throw new IllegalArgumentException("position already has a left child");
		}
		Node<E> right = createNode(node, null, null, element);
		node.right = right;
		return right;
	}

	@Override
	public void attach( Position<E> position, Tree<E> left, Tree<E> right ) throws IllegalArgumentException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public E set( Position<E> position, E newValue ) throws IllegalArgumentException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove( Position<E> position ) throws IllegalArgumentException
	{
		Node<E> node = validate(position);
		if( numChildren(node) == 2 )
		{
			throw new IllegalArgumentException("position has two childrens");
		}
		Node<E> parent = node.parent;
		Node<E> child = node.left != null ? node.left : node.right;
		if( child != null )
		{
			child.parent = parent;
		}
		if( node == root )
		{
			root = child;
		}
		else
		{
			if( left(parent) == node )
			{
				parent.left = child;
			}
			else
			{
				parent.right = child;
			}
		}
		size--;
		E temp = node.getElement();
		node.parent = node;
		node.left = null;
		node.right = null;
		node.element = null;

		return temp;
	}

	public int size()
	{
		return size;
	}
}
